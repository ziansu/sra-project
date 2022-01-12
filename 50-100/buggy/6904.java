@java.lang.Override
public void kill() {
    if ((key) != (-1)) {
        java.util.ArrayList<com.watabou.pixeldungeon.effects.SystemFloatingText> stack = com.watabou.pixeldungeon.effects.SystemFloatingText.stacks.get(key);
        stack.remove(this);
        if (stack.isEmpty()) {
            com.watabou.pixeldungeon.effects.SystemFloatingText.stacks.remove(key);
        }
        key = -1;
    }
    super.kill();
}