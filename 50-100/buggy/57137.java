public static java.util.List<org.kaaproject.kaa.examples.gpiocontrol.model.DeviceGroup> getMockedDeviceGroupList() {
    java.util.List<org.kaaproject.kaa.examples.gpiocontrol.model.DeviceGroup> deviceGroupList = new java.util.ArrayList<>();
    for (int i = 0; i < 5; i++) {
        deviceGroupList.add(new org.kaaproject.kaa.examples.gpiocontrol.model.DeviceGroup(("Group " + i), false, R.drawable.empty_group_icon, "3/12 selected", i));
    }
    return deviceGroupList;
}