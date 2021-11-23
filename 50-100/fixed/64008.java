@stanhebben.zenscript.annotations.ZenMethod
public static void add(crafttweaker.api.item.IItemStack inputBlock, crafttweaker.api.item.IItemStack outputBlock, crafttweaker.api.item.IItemStack[] additionalOutput) {
    if (!(com.blamejared.mtlib.helpers.InputHelper.isABlock(inputBlock)))
        com.blamejared.mtlib.helpers.LogHelper.logError("Input must be a block", new java.lang.IllegalArgumentException());
    
    ModTweaker.LATE_ADDITIONS.add(new com.blamejared.compat.betterwithmods.Turntable.Add(com.blamejared.mtlib.helpers.InputHelper.toStack(inputBlock), com.blamejared.mtlib.helpers.InputHelper.toStack(outputBlock), com.google.common.collect.Lists.newArrayList(com.blamejared.mtlib.helpers.InputHelper.toStacks(additionalOutput))));
}