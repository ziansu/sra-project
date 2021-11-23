@java.lang.Override
public hcmue.gst.off.extensions.Result<hcmue.gst.off.entities.User> save(hcmue.gst.off.entities.User user) {
    if ((user.getId()) == null) {
        if ((userRepository.findByUsername(user.getUsername())) != null) {
            return Fail("Username đã tồn tại");
        }
    }
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    return Success(userRepository.save(user));
}