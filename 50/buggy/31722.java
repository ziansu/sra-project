public com.uberverse.arkcraft.common.engram.EngramManager.Engram getEngram(int index) {
    return (engrams.size()) > index ? engrams.get(index) : null;
}