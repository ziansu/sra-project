@java.lang.Override
public net.smartcosmos.dto.metadata.PageInformation convert(org.springframework.data.domain.PageImpl<?> page) {
    return net.smartcosmos.dto.metadata.PageInformation.builder().number(((page.getTotalElements()) > 0 ? (page.getNumber()) + 1 : 0)).totalElements(page.getTotalElements()).size(page.getNumberOfElements()).totalPages(page.getTotalPages()).build();
}