public static boolean checkIfUpdating() {
    boolean a = com.example.kristian.ideacreator.Shared.isUpdating.get();
    boolean b = !(com.example.kristian.ideacreator.Shared.idsOfPacksCurrentlyInstalling.isEmpty());
    return a || b;
}