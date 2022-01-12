public java.util.List<com.dkpen.eapproval.dto.EappPaperDTO> getWaitPaperList(com.dkpen.eapproval.dto.UserDTO userDTO) {
    com.dkpen.eapproval.domain.User user = new com.dkpen.eapproval.domain.User();
    user.setUid(userDTO.getUid());
    user.setEmail(userDTO.getEmail());
    user.setName(userDTO.getName());
    com.dkpen.eapproval.domain.EappLine eappLine = new com.dkpen.eapproval.domain.EappLine();
    eappLine.setUser(user);
    eappLine.setApproveStatus(EappLineDTO.APPROVE_STATUS_READY);
    java.util.List<com.dkpen.eapproval.dto.EappPaperDTO> waitPaperDTOList = paperRepository.searchWaitPaperList(user);
    return waitPaperDTOList;
}