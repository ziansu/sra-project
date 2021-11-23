@java.lang.Override
public void onClick(android.view.View v) {
    if ((sampleingStatus) == (edu.wichita.iot.smart_home.comfortvote.DataSamplingFragment.STATUS_STOP)) {
        ((android.widget.Button) (v.findViewById(R.id.btn_sample))).setText("Start");
        smartBand.activateForSampling(getActivity());
        sampleingStatus = edu.wichita.iot.smart_home.comfortvote.DataSamplingFragment.STATUS_RUN;
    }else
        if ((sampleingStatus) == (edu.wichita.iot.smart_home.comfortvote.DataSamplingFragment.STATUS_RUN)) {
            ((android.widget.Button) (v.findViewById(R.id.btn_sample))).setText("Stop");
            smartBand.pause();
            sampleingStatus = edu.wichita.iot.smart_home.comfortvote.DataSamplingFragment.STATUS_STOP;
        }
    
}