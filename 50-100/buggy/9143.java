@de.craften.plugins.rpgplus.scripting.util.luaify.LuaFunction(value = "setItem")
public void setItem(org.luaj.vm2.LuaValue inv, org.luaj.vm2.LuaValue slot, org.luaj.vm2.LuaTable item) {
    inventory.setItem(slot.checkint(), de.craften.plugins.rpgplus.scripting.util.ScriptUtil.createItemMatcher(item).getItemStack());
    for (org.bukkit.entity.HumanEntity viewer : inventory.getViewers()) {
        viewer.openInventory(inventory);
    }
}