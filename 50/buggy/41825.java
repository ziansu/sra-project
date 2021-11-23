private void kickOut(com.avengers.netty.socket.gate.wood.User user) {
    int seatNumber = getSeatNumber(user);
    players[seatNumber].setUser(null);
    players[seatNumber].reset();
    room.removeUser(user);
}