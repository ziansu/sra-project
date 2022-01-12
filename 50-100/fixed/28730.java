@org.junit.Test
@org.springframework.transaction.annotation.Transactional
public void getContainerCodesWithoutBarcodes() {
    java.util.List<java.lang.String> plateBarcodes = new java.util.ArrayList<java.lang.String>();
    plateBarcodes.add("hitpick master plate");
    com.labsynch.labseer.service.ContainerLSServiceTests.logger.info(("querying with: " + (plateBarcodes.toString())));
    java.util.Collection<com.labsynch.labseer.dto.CodeLabelDTO> result = containerService.getContainerCodesByLabels(plateBarcodes, null, null, null, null, false, false);
    com.labsynch.labseer.service.ContainerLSServiceTests.logger.info(com.labsynch.labseer.dto.CodeLabelDTO.toJsonArray(result));
    junit.framework.Assert.assertTrue(((result.size()) > 0));
}