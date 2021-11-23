public static <T> org.springframework.http.ResponseEntity<T> reseted(T entity) {
    return new org.springframework.http.ResponseEntity(entity, org.springframework.http.HttpStatus.CREATED);
}