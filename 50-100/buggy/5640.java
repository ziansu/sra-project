@org.springframework.web.bind.annotation.RequestMapping(value = "channel/data/{id}", method = { org.springframework.web.bind.annotation.RequestMethod.POST , org.springframework.web.bind.annotation.RequestMethod.PUT })
@org.springframework.web.bind.annotation.ResponseBody
public org.crusoe.dto.cms.ChannelDTO update(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Long id, @org.springframework.web.bind.annotation.RequestBody
org.crusoe.dto.cms.ChannelDTO c) {
    org.crusoe.entity.cms.Channel channel = channelService.findById(id);
    channel.setTitle(c.getName());
    channel.setSequenceIndex(c.getSequenceIndex());
    channel.setState(c.getState());
    channel.setParent(channelService.findById(c.getParent().getId()));
    org.crusoe.entity.cms.Channel savedChannel = channelService.save(channel);
    return c;
}