public static com.watabou.noosa.Text status() {
    if (com.nyrds.android.util.ModdingMode.getClassicTextRenderingMode()) {
        return ((com.watabou.pixeldungeon.effects.FloatingText) (com.watabou.pixeldungeon.scenes.GameScene.scene.statuses.recycle(com.watabou.pixeldungeon.effects.FloatingText.class)));
    }else {
        return ((com.watabou.pixeldungeon.effects.SystemFloatingText) (com.watabou.pixeldungeon.scenes.GameScene.scene.statuses.recycle(com.watabou.pixeldungeon.effects.SystemFloatingText.class)));
    }
}