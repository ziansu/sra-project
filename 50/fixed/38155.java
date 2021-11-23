@java.lang.Override
public void transform(hcm.ssj.core.stream.Stream[] stream_in, hcm.ssj.core.stream.Stream stream_out) {
    if ((ssi_object) != 0)
        hcm.ssj.mobileSSI.SSI.transform(ssi_object, stream_in[0], stream_out);
    
}