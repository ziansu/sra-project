@java.lang.Override
public boolean isDoorway() {
    if (((doorDirection) != null) && ((doorDirection) != (clueGame.RoomCell.DoorDirection.NONE))) {
        return true;
    }else
        return false;
    
}