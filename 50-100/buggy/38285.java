@org.junit.Test
@org.springframework.transaction.annotation.Transactional
public void deletePoints() throws java.lang.Exception {
    pointsRepository.saveAndFlush(points);
    int databaseSizeBeforeDelete = pointsRepository.findAll().size();
    restPointsMockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete("/api/points/{id}", points.getId()).accept(TestUtil.APPLICATION_JSON_UTF8)).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isOk());
    java.util.List<org.daniels.jhipster.myhealth.domain.Points> points = pointsRepository.findAll();
    org.assertj.core.api.Assertions.assertThat(points).hasSize((databaseSizeBeforeDelete - 1));
}