public void setTrainID(int trainID) {
    this.trainID = trainID;
    trainName = new me.kk47.modeltrains.math.ScrollingName(net.minecraft.client.resources.I18n.format(((me.kk47.modeltrains.items.trains.TrainRegistry.getTrain(trainID).getUnlocalizedName()) + ".name")), 12);
    stack = new net.minecraft.item.ItemStack(me.kk47.modeltrains.items.trains.TrainRegistry.getTrain(trainID).asItem());
}