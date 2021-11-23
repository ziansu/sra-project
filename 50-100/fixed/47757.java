@java.lang.Override
public void draw() {
    sb.setProjectionMatrix(VimFight.cam.combined);
    sb.begin();
    font.draw(sb, hint, (((game.vim.VimFight.WIDTH) - (15 * (hint.length()))) / 2), 100);
    sb.end();
}