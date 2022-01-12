@java.lang.Override
public hcmue.gst.off.extensions.Result<hcmue.gst.off.entities.User> save(hcmue.gst.off.entities.User user) {
    if ((userRepository.findByUsername(user.getUsername())) != null) {
        return Fail("Username đã tồn tại");
    }else {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return Success(userRepository.save(user));
    }
}