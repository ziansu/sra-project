@java.lang.Override
public net.minecraftforge.client.model.IModel process(com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> customData) {
    net.minecraftforge.client.model.obj.OBJModel ret = new net.minecraftforge.client.model.obj.OBJModel(this.matLib, this.modelLocation, new net.minecraftforge.client.model.obj.OBJModel.CustomData(customData));
    return ret;
}