public static boolean check() {
    Utils.Utils.print("Sprawdzanie wymaganej ilości pamięci RAM.");
    int memoryAmount = Utils.Utils.humanReadableRAM();
    int requestedMemory = 4;
    return requestedMemory <= memoryAmount;
}