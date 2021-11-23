@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
public float getModifiedAmount(net.minecraft.item.ItemStack stack, java.lang.String modifierName) {
    if (modifierName.equals(""))
        return 0;
    
    java.util.Iterator itr = stack.getAttributeModifiers().get(modifierName).iterator();
    float f = 0;
    while (itr.hasNext()) {
        f += ((net.minecraft.entity.ai.attributes.AttributeModifier) (itr.next())).getAmount();
    } 
    return f;
}