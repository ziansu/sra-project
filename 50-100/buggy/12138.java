public java.lang.String toString() {
    java.lang.String str = "";
    for (int i = 0; i < (org.astrobotics.ds2016.io.Protocol.ControlData.data.length); i++) {
        str = (((str + "\n") + i) + ": ") + (org.astrobotics.ds2016.io.Protocol.ControlData.data[i]);
    }
    return str;
}