private void getRandomColor(ioio.examples.holiday.HolidayIOIOActivity.RGB rgb) {
    synchronized(frame_) {
        final int i = ((int) ((java.lang.Math.random()) * (frame_.length)));
        rgb.r = frame_[i].r;
        rgb.g = frame_[i].g;
        rgb.b = frame_[i].b;
    }
}