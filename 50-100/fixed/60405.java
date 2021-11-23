public void pull(cn.nonocast.model.User user) {
    this.pull(user.getId());
    this.email = user.getEmail();
    this.name = user.getName();
    this.role = user.getRole();
    this.mobile = user.getMobile();
    this.wechatid = user.getWechatid();
    this.location = user.getLocation();
}