@org.springframework.data.jpa.repository.Modifying
@org.springframework.transaction.annotation.Transactional
@org.springframework.data.jpa.repository.Query(value = "delete from annotation where event_id = ?1 and type = ?2")
void deleteByEventAndType(long eventId, java.lang.String faq);