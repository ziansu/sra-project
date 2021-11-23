public void test_when_VideoH264PacketProducer_has_started_then_isWorking_returns_true_otherwise_false() {
    com.example.zebul.cameraservice.packet_producers.video.camera.CameraVideoH264PacketProducer producer = new com.example.zebul.cameraservice.packet_producers.video.camera.CameraVideoH264PacketProducer(new com.example.zebul.cameraservice.packet_producers.CameraVideoH264PacketProducerTest.H264PacketListenerFake(), new com.example.zebul.cameraservice.packet_producers.CameraVideoH264PacketProducerTest.PacketProductionExceptionListenerFake());
    assertFalse(producer.isWorking());
    for (int i = 0; i < 3; i++) {
        producer.start(defaultCameraSettings, (i + ""));
        assertTrue(producer.isWorking());
        producer.stop();
        assertFalse(producer.isWorking());
    }
}