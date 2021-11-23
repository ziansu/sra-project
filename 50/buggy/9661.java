@org.springframework.transaction.annotation.Transactional
public ua.in.ngo.ednist.self.SelfInfo getSelfInfo() {
    ua.in.ngo.ednist.self.SelfInfo info = selfInfoDao.getSelfInfo();
    info.setLogoPath("/resources/self/logo/logo.png");
    return info;
}