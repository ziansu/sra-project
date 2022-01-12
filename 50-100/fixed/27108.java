@java.lang.Override
public void handleEvent(org.osgi.service.event.Event e) {
    if (((e.getProperty(ColorControllerService.COLOR_KEY)) == null) || (!((e.getProperty(ColorControllerService.COLOR_KEY)) instanceof no.ntnu.item.its.osgi.common.enums.EColor)))
        return ;
    
    no.ntnu.item.its.osgi.train.adapter.handlers.common.readings.ColorReading cr = new no.ntnu.item.its.osgi.train.adapter.handlers.common.readings.ColorReading(convert(((no.ntnu.item.its.osgi.common.enums.EColor) (e.getProperty(ColorControllerService.COLOR_KEY)))));
    receiver.sendColorEvent(cr);
}