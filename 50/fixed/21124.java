@org.springframework.data.jpa.repository.Modifying
@org.springframework.data.jpa.repository.Query(value = "insert into menutag_detail" + "(menu_id, tag_id) values(?1, ?2)", nativeQuery = true)
void insertMenuTagDetail(java.lang.Long menuId, java.lang.Long tagId);