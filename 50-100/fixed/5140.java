public static boolean hasEqualIceCream(net.minecraft.item.ItemStack stack1, net.minecraft.item.ItemStack stack2) {
    if ((stack1 == null) || (stack2 == null))
        return false;
    
    if ((!((stack1.getItem()) instanceof dk.mrspring.kitchen.item.food.ItemIceCreamableBase)) || (!((stack2.getItem()) instanceof dk.mrspring.kitchen.item.food.ItemIceCreamableBase)))
        return false;
    
    java.lang.String[] cream1 = dk.mrspring.kitchen.item.food.ItemIceCreamableBase.getIceCreamFromStack(stack1);
    java.lang.String[] cream2 = dk.mrspring.kitchen.item.food.ItemIceCreamableBase.getIceCreamFromStack(stack2);
    return java.util.Arrays.equals(cream1, cream2);
}