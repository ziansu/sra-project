public void addSecondPlayer(org.moshe.arad.repositories.entities.GameRoom gameRoom) {
    java.lang.Long userId = ((org.moshe.arad.repositories.entities.GameUser) (org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getPrincipal())).getUserId();
    gameRoom.setBlack(userId);
    gameRoomRepository.save(gameRoom);
}