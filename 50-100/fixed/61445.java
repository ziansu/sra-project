@java.lang.Override
public void run() {
    eventBus.register(hotelImagesService);
    eventBus.register(amenityService);
    eventBus.register(refPointService);
    eventBus.register(descriptionService);
    eventBus.post(new com.qccr.livtrip.biz.event.DataEvent(productId, hotelDetail, hotel));
}