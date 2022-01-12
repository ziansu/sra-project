public java.util.List<com.dkpen.eapproval.dto.EappPaperDTO> getWaitPaperList(com.dkpen.eapproval.dto.UserDTO userDTO) {
    com.dkpen.eapproval.domain.User user = new com.dkpen.eapproval.domain.User();
    user.setUid(userDTO.getUid());
    user.setEmail(userDTO.getEmail());
    user.setName(userDTO.getName());
    java.util.List<com.dkpen.eapproval.dto.EappPaperDTO> waitPaperDTOList = paperRepository.searchWaitPaperList(user, EappLineDTO.APPROVE_STATUS_READY);
    return waitPaperDTOList;
}