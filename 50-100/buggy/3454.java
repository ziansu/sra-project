public void test_when_CameraVideoH264PacketProducer_starts_second_time_in_row_then_returns_false() {
    com.example.zebul.cameraservice.packet_producers.CameraVideoH264PacketProducerTest.PacketProductionExceptionListenerFake exceptionListener = new com.example.zebul.cameraservice.packet_producers.CameraVideoH264PacketProducerTest.PacketProductionExceptionListenerFake();
    com.example.zebul.cameraservice.packet_producers.video.camera.CameraVideoH264PacketProducer producer = new com.example.zebul.cameraservice.packet_producers.video.camera.CameraVideoH264PacketProducer(new com.example.zebul.cameraservice.packet_producers.CameraVideoH264PacketProducerTest.H264PacketListenerFake(), exceptionListener);
    try {
        boolean startResult1 = producer.start(defaultCameraSettings);
        assertTrue(startResult1);
        boolean startResult2 = producer.start(defaultCameraSettings, "2");
        assertFalse(startResult2);
    } finally {
        producer.stop();
    }
}