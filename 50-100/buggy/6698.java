@java.lang.Override
public void init(ijfx.ui.module.input.Input input) {
    if (ChannelSelector.STYLE.equals(input.getWidgetType())) {
        channelSelector = new ijfx.ui.correction.ChannelSelector(null);
        channelSelector.channelNumberProperty().setValue(10);
        channelSelector.selectedChannelProperty().asObject().bindBidirectional(valueProperty());
        channelSelector.selectChannel(((int) (input.getValue())));
        node = channelSelector;
    }else {
        super.init(input);
        node = super.getNode();
    }
}