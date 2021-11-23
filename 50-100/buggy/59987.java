@org.springframework.transaction.annotation.Transactional(readOnly = true)
private org.springframework.data.jpa.domain.Specification<br.com.maiscambio.model.entity.Estabelecimento> pessoaIdEquals(final java.lang.Long pessoaId) {
    return new org.springframework.data.jpa.domain.Specification<br.com.maiscambio.model.entity.Estabelecimento>() {
        @java.lang.Override
        public javax.persistence.criteria.Predicate toPredicate(javax.persistence.criteria.Root<br.com.maiscambio.model.entity.Estabelecimento> root, javax.persistence.criteria.CriteriaQuery<?> criteriaQuery, javax.persistence.criteria.CriteriaBuilder criteriaBuilder) {
            return criteriaBuilder.equal(root.get("pessoa").get("pessoaId"), pessoaId);
        }
    };
}