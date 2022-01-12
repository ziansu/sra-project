@java.lang.Override
public uk.ac.cam.cl.dtg.segue.dto.content.ContentSummaryDTO extractContentSummary(final uk.ac.cam.cl.dtg.segue.dto.content.ContentDTO content) {
    if (null == content) {
        return null;
    }
    return mapper.getAutoMapper().map(content, uk.ac.cam.cl.dtg.segue.dto.content.ContentSummaryDTO.class);
}