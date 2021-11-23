@java.lang.Override
public void init() {
    net.minecraft.item.Item studentCmdBlock = net.minecraftforge.fml.common.registry.GameRegistry.findItem("dyn|items", "student_command_block");
    net.minecraft.client.Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(studentCmdBlock, 0, new net.minecraft.client.resources.model.ModelResourceLocation(new net.minecraft.util.ResourceLocation("dynitems", "textures/blocks/student_command_block.png"), null));
}