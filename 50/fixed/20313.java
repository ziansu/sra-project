@java.lang.Override
public void handle(@org.jetbrains.annotations.NotNull
net.minecraftforge.fml.common.network.simpleimpl.MessageContext ctx) {
    if (!(com.teamwizardry.librarianlib.features.helpers.ItemNBTHelper.verifyExistence(stack, "uuid"))) {
        com.teamwizardry.librarianlib.features.helpers.ItemNBTHelper.setUUID(stack, "uuid", uuid);
    }
}