public void startDeltaRecording() {
    if (delta_recording_start) {
    }
    if (!(delta_recording_start)) {
        p.println("DELTA RECORDING RUNNING");
        delta_local_x = 0;
        delta_local_y = 0;
        delta_rotation = 0;
        delta_t = 0;
        delta_b = 0;
        delta_l = 0;
        delta_r = 0;
        delta_recording_start = true;
    }
}