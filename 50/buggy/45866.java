public java.util.List<com.artorias.dto.PostDTO> pagedListAsDto(int pageNumber) {
    java.lang.System.out.println(("****** RESULTS AS MAP " + (list(pageNumber))));
    return listAsDto(list(pageNumber));
}