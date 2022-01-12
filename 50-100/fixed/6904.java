@java.lang.Override
public void kill() {
    java.util.ArrayList<com.watabou.pixeldungeon.effects.SystemFloatingText> stack = com.watabou.pixeldungeon.effects.SystemFloatingText.stacks.get(key);
    if (stack != null) {
        stack.remove(this);
        if (stack.isEmpty()) {
            com.watabou.pixeldungeon.effects.SystemFloatingText.stacks.remove(key);
        }
    }
    super.kill();
}