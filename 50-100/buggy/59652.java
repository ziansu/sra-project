@java.lang.Override
public void set(us.ihmc.humanoidRobotics.communication.packets.walking.FootstepDataListMessage message) {
    swingTime = message.swingTime;
    transferTime = message.transferTime;
    java.util.ArrayList<us.ihmc.humanoidRobotics.communication.packets.walking.FootstepDataMessage> dataList = message.getDataList();
    clear();
    if (dataList != null) {
        for (int i = 0; i < (dataList.size()); i++)
            footsteps.add().set(dataList.get(i));
        
    }
}