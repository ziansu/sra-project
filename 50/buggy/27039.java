@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('ROLE_ADMIN')")
@edu.mum.annotation.Logging
public void save(edu.mum.domain.Member member) {
    updateAuthorities(member.getCredential().getAuthorityList(), member.getCredential().getAuthorities());
    memberDao.save(member);
}