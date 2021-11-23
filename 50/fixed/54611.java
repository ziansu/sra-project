public void sendSensorData(final long timestamp, final float value) {
    executorService.submit(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            sendSensorDataInBackground(timestamp, value);
        }
    });
}