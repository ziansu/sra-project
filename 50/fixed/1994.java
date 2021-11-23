@java.lang.Override
public void deleteRoom(int room) {
    entityManager.remove(getRoomsById(room));
}