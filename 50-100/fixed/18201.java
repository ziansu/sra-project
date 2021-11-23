@org.springframework.transaction.annotation.Transactional
protected void persistNodeLinks() {
    com.artronics.sdwn.domain.entities.node.SdwnNeighbor n1_245 = new com.artronics.sdwn.domain.entities.node.SdwnNeighbor(sink2, node245, 10.0, 245);
    com.artronics.sdwn.domain.entities.node.SdwnNeighbor n245_246 = new com.artronics.sdwn.domain.entities.node.SdwnNeighbor(node245, node246, 20.0, 235);
    com.artronics.sdwn.domain.entities.node.SdwnNeighbor n245_30 = new com.artronics.sdwn.domain.entities.node.SdwnNeighbor(node245, sameAddNode2, 100.0, 155);
}