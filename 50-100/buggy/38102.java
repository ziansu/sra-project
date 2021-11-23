public static boolean doesStackContain(@javax.annotation.Nonnull
net.minecraft.item.ItemStack stackA, @javax.annotation.Nonnull
net.minecraft.item.ItemStack stackB) {
    return (!(stackA.isEmpty())) && ((stackB.isEmpty()) || ((de.teamlapen.lib.lib.util.ItemStackUtil.areStacksEqualIgnoreAmount(stackA, stackB)) && ((stackA.getCount()) >= (stackB.getCount()))));
}