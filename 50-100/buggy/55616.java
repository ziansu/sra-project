@org.junit.Test
@org.springframework.transaction.annotation.Transactional
public void checkDateIsRequired() throws java.lang.Exception {
    int databaseSizeBeforeTest = pointsRepository.findAll().size();
    points.setDate(null);
    restPointsMockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post("/api/points").contentType(TestUtil.APPLICATION_JSON_UTF8).content(org.daniels.jhipster.myhealth.web.rest.TestUtil.convertObjectToJsonBytes(points))).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isBadRequest());
    java.util.List<org.daniels.jhipster.myhealth.domain.Points> points = pointsRepository.findAll();
    org.assertj.core.api.Assertions.assertThat(points).hasSize(databaseSizeBeforeTest);
}