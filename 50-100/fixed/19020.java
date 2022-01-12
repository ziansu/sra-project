public void SetPosition(PVector pos, PVector size) {
    super.SetPosition(pos);
    list.setPosition(pos.x, pos.y);
    list.setSize(((int) (size.x)), ((int) (size.y)));
}