@java.lang.Override
public void readFrom(org.elasticsearch.common.io.stream.StreamInput in) throws java.io.IOException {
    name = in.readString();
    length = in.readVLong();
    recovered = in.readVLong();
    if (in.getVersion().onOrAfter(Version.V_1_5_0)) {
        reused = in.readBoolean();
    }else {
        reused = (recovered) <= 0;
    }
}