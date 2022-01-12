public io.codechobostudy.notifications.dto.NotiCntDTO toDTO(io.codechobostudy.notifications.domain.NotiCnt notiCnt) {
    if (notiCnt == null) {
        notiCnt = new io.codechobostudy.notifications.domain.NotiCnt();
    }
    io.codechobostudy.notifications.dto.NotiCntDTO notiCntDTO = new io.codechobostudy.notifications.dto.NotiCntDTO();
    notiCntDTO.notiCntIdx = notiCnt.getNotiCntIdx();
    notiCntDTO.totalCnt = notiCnt.getTotalCnt();
    notiCntDTO.boardCnt = notiCnt.getBoardCnt();
    notiCntDTO.qnaCnt = notiCnt.getQnaCnt();
    if ((notiCnt.getUser()) != null) {
        notiCntDTO.userDTO = new io.codechobostudy.mock.user.dto.MockUserDTO().toDTO(notiCnt.getUser());
    }
    return notiCntDTO;
}