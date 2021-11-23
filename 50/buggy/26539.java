@org.springframework.transaction.annotation.Transactional(readOnly = true)
@java.lang.Override
public com.neemre.bitplexus.common.dto.MemberDto findMemberByUsername(java.lang.String username) {
    com.neemre.bitplexus.backend.model.Member member = memberRepository.findByUsername(username);
    java.lang.System.out.println(member);
    return dtoAssembler.assemble(member, com.neemre.bitplexus.backend.model.Member.class, com.neemre.bitplexus.common.dto.MemberDto.class);
}