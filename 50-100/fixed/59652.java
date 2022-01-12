@java.lang.Override
public void set(us.ihmc.humanoidRobotics.communication.packets.walking.FootstepDataListMessage message) {
    clear();
    swingTime = message.swingTime;
    transferTime = message.transferTime;
    java.util.ArrayList<us.ihmc.humanoidRobotics.communication.packets.walking.FootstepDataMessage> dataList = message.getDataList();
    if (dataList != null) {
        for (int i = 0; i < (dataList.size()); i++)
            footsteps.add().set(dataList.get(i));
        
    }
}